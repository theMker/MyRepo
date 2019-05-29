package testpackage.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import testpackage.model.CreateFeedbackP;
public interface CreateFeedbackPMRepo extends MongoRepository<CreateFeedbackP,String>{

}
