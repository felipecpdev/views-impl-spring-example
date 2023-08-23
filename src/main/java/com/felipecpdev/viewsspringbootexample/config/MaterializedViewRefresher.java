package com.felipecpdev.viewsspringbootexample.config;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MaterializedViewRefresher {
    private static final Logger logger = LoggerFactory.getLogger(MaterializedViewRefresher.class);

    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Scheduled(fixedRate = 10000)
    public void refresh() {
        this.entityManager.createNativeQuery("REFRESH MATERIALIZED VIEW CONCURRENTLY post_summary").executeUpdate();
        logger.info("Materialized View Refresher!");
    }

}
