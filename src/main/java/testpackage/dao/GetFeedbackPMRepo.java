package testpackage.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import testpackage.model.GetFeedbackP;
public interface GetFeedbackPMRepo extends MongoRepository<GetFeedbackP,String>{

}
