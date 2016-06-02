package com.galvanize.company;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by localadmin on 02/06/2016.
 */
public interface companyRepository extends MongoRepository<Company,String> {
}
