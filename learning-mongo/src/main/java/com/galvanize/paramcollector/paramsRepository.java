package com.galvanize.paramcollector;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by localadmin on 02/06/2016.
 */
public interface paramsRepository extends MongoRepository<Params,String> {
}
