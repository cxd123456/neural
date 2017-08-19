package cn.ms.neural.limiter;

public enum LimStatus {

	/**
	 * 校验通过
	 */
	OK,

	/**
	 * 没有发现限流规则
	 */
	NORULE,

	/**
	 * 限流资源已满
	 */
	FULL,

	/**
	 * 非法结果
	 */
	ILLAGE,

	/**
	 * 未知异常
	 */
	UNKNOWN

}