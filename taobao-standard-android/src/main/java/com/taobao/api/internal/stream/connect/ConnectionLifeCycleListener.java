package com.taobao.api.internal.stream.connect;

/**
 * 连接的生命周期的监听器
 * @author zhenzi
 * 2011-8-8 下午05:47:59
 */
public interface ConnectionLifeCycleListener {
	/**
	 * 在每次发起连接请求之前，允许应用程序做一些事情。
	 */
	public void onBeforeConnect();
	/**
	 * 连接成功后调用此方法
	 */
	public void onConnect();
	
	/**
	 * 出现异常时调用此方法
	 */
	public void onException(Throwable throwable);
	
	/**
	 * 连接出现错误，需要检查一下原因。
	 * @param e
	 */
	public void onConnectError(Exception e);
	/**
	 * 读取超时，这个时候可能网络有问题了，需要检查一下原因
	 * 客户端：需要补数据
	 */
	public void onReadTimeout();
	/**
	 * 当系统在30分钟内超过10次timeout了,则调用这个方法,退出，可能网络有问题了，需要检查一下原因
	 * 客户端：需要补数据
	 */
	public void onMaxReadTimeoutException();
	/**
	 * 当出现系统级别，比如签名错误，丢失参数等异常时
	 * 检查http的响应头errmsg查看具体错误原因
	 * @param e
	 */
	public void onSysErrorException(Exception e);
}
