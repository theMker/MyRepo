package testpackage.services.impl;

import java.util.*;

import testpackage.model.*;

import testpackage.dao.*;
import testpackage.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class GetFeedbackImpl implements GetFeedbackI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public GetFeedbackResponseWrapper execute(GetFeedbackP pojo){
		//TODO
		return new GetFeedbackResponseWrapper();
	}

	public GetFeedbackResponseWrapper reliable(GetFeedbackP pojo){
		//TODO
		return new GetFeedbackResponseWrapper();
	}
	@Override
	public <T> T error(int statusCode, Class<T> type,Exception exception)
			throws InstantiationException, IllegalAccessException {
		//TODO to write error response
		return type.newInstance();
	}}