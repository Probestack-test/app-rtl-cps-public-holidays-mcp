package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.DefaultApiDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for DefaultApi documents.
 */
public interface DefaultApiMongoRepository extends MongoRepository<DefaultApiDocument, String> {
}
