package com.yb.activity;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;

	private static String KEY = "main";

	public void execute() {
		repositoryService.createDeployment().addClasspathResource("conf/leave.bpmn").deploy();
		runtimeService.startProcessInstanceByKey(KEY);
	}
}
