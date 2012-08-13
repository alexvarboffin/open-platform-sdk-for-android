package com.taobao.api.internal.stream;

import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

import android.util.Log;

import com.taobao.api.internal.stream.connect.HttpResponse;
import com.taobao.api.internal.stream.message.StreamMsgConsumeFactory;
import com.taobao.api.internal.stream.message.TopCometMessageListener;

/**
 * 
 * @author zhenzi 2011-8-12 上午10:02:57
 */
public abstract class AbstractStreamImpl implements StreamImplementation {
	// private static final Logger log =
	// Logger.getLogger(AbstractStreamImpl.class);
	private static final String TAG = "AbstractStreamImpl";
	protected HttpResponse response;
	private StreamMsgConsumeFactory msgConsumeFactory;
	protected boolean streamAlive = true;

	public AbstractStreamImpl(StreamMsgConsumeFactory msgConsumeFactory,
			HttpResponse response) {
		this.msgConsumeFactory = msgConsumeFactory;
		this.response = response;
	}

	public void nextMsg() throws IOException {
		if (!streamAlive) {
			throw new IOException("Stream closed");
		}
		try {
			String line = response.getMsg();
			if (line == null) {// 正常读到流的末尾了。
				streamAlive = false;
				response.close();
				return;
			}
			msgConsumeFactory.consume(new StreamEvent(line));
		} catch (IOException e) {// 这个时候抛出：SocketTimeoutException
			response.close();
			streamAlive = false;
			throw e;
		} catch (RejectedExecutionException rejectException) {
			Log.e(TAG, "Message consume thread pool is full:", rejectException);
		} catch (NullPointerException npe) {
			Log.e(TAG, "Null point exception:", npe);
		}
	}

	public boolean isAlive() {
		return streamAlive;
	}

	public abstract TopCometMessageListener getMessageListener();

	class StreamEvent implements Runnable {
		String msg;

		StreamEvent(String msg) {
			this.msg = msg;
		}

		public void run() {
			String line = null;
			try {
				line = parseLine(msg);
			} catch (Exception e) {
				Log.e(TAG, "parse error line:" + msg, e);
			}
			if (line != null) {
				getMessageListener().onReceiveMsg(line);
			}
		}

	}

}
