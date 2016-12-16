package com.yb.activity;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component
public class CompleteListener implements TaskListener {

	/**
	 * <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;

	public void notify(DelegateTask delegateTask) {
		System.out.println(("end ：" + delegateTask.getName()));
	}

}
