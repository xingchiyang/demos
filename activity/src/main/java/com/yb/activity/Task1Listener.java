package com.yb.activity;

import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Task1Listener implements TaskListener {
	/**
	 * <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private TaskService taskService;
	private Logger logger = LoggerFactory.getLogger(Task1Listener.class);

	public void notify(DelegateTask delegateTask) {
		String taskKey = delegateTask.getTaskDefinitionKey();
		
		logger.info("执行任务" + taskKey);
		taskService.complete(taskKey);
	}

}
