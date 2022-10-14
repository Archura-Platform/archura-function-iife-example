package io.archura.platform.functionalcore.iife;

import io.archura.platform.api.context.Context;
import io.archura.platform.api.logger.Logger;
import io.archura.platform.api.type.Configurable;
import io.archura.platform.api.type.functionalcore.ContextConsumer;

import java.util.Map;

public class IIFEFunction implements ContextConsumer, Configurable {

    private Map<String, Object> configuration;

    @Override
    public void setConfiguration(Map<String, Object> configuration) {
        this.configuration = configuration;
    }

    @Override
    public void accept(Context context) {
        final Logger logger = context.getLogger();
        logger.info("IIFE function example, configuration: " + configuration);
    }

}
