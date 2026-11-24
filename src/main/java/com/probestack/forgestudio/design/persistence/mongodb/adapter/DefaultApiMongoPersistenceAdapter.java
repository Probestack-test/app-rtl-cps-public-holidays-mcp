package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.DefaultApiDomainRepository;
import com.probestack.forgestudio.design.model.DefaultApi;
import com.probestack.forgestudio.design.persistence.mongodb.document.DefaultApiDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.DefaultApiMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class DefaultApiMongoPersistenceAdapter implements DefaultApiDomainRepository {
    private final DefaultApiMongoRepository repository;

    public DefaultApiMongoPersistenceAdapter(DefaultApiMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public DefaultApi save(DefaultApi defaultApi) {
        DefaultApiDocument document = toDocument(defaultApi);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<DefaultApi> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<DefaultApi> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private DefaultApiDocument toDocument(DefaultApi defaultApi) {
        DefaultApiDocument document = new DefaultApiDocument();
        BeanUtils.copyProperties(defaultApi, document);
        return document;
    }

    private DefaultApi toDomain(DefaultApiDocument document) {
        DefaultApi domain = new DefaultApi();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
