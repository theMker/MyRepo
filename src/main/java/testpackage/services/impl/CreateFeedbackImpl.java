package testpackage.services.impl;

import java.util.*;

import testpackage.model.*;

import testpackage.dao.*;
import testpackage.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class CreateFeedbackImpl implements CreateFeedbackI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public CreateFeedbackResponseWrapper execute(CreateFeedbackP pojo){
		//TODO
		return new CreateFeedbackResponseWrapper();
	}

	public CreateFeedbackResponseWrapper reliable(CreateFeedbackP pojo){
		//TODO
		return new CreateFeedbackResponseWrapper();
	}
	@Override
	public <T> T error(int statusCode, Class<T> type,Exception exception)
			throws InstantiationException, IllegalAccessException {
		//TODO to write error response
		return type.newInstance();
	}}