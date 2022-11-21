package com.mycompany.sampleapplication;

import com.mycompany.sampleapplication.SampleApplicationApp;
import com.mycompany.sampleapplication.config.AsyncSyncConfiguration;
import com.mycompany.sampleapplication.config.EmbeddedElasticsearch;
import com.mycompany.sampleapplication.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { SampleApplicationApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
