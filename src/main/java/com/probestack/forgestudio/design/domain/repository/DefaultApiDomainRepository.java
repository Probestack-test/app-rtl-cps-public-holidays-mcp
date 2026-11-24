package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.DefaultApi;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for DefaultApi domain operations.
 */
public interface DefaultApiDomainRepository {
    DefaultApi save(DefaultApi defaultApi);

    Optional<DefaultApi> findById(String id);

    List<DefaultApi> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
