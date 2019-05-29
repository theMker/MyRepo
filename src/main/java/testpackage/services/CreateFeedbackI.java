package testpackage.services;

import java.util.*;

import testpackage.model.*;

public interface CreateFeedbackI {

	public CreateFeedbackResponseWrapper execute(CreateFeedbackP pojo);
	public <T> T error(int statusCode,Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}