package com.yb.activity;

import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateListener implements TaskListener {
	/**
	 * <code>serialVersionUID</code>
	 */
	@Autowired
	private TaskService taskService;
	private static final long serialVersionUID = 1L;

	public void notify(DelegateTask delegateTask) {
		System.out.println("start ：" + delegateTask.getName());
		System.out.println("complete： " + delegateTask.getName());
		taskService.complete(delegateTask.getId(), delegateTask.getVariables());
	}

}
