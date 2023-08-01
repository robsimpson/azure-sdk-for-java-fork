// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.messaging.listener;

import com.azure.spring.cloud.service.listener.MessageListener;
import com.azure.spring.messaging.implementation.config.AzureListenerEndpoint;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Properties;

/**
 *
 */
public class MessageListenerTestContainer implements MessageListenerContainer, InitializingBean, DisposableBean {

    private final AzureListenerEndpoint endpoint;

    private boolean autoStartup = true;

    private boolean startInvoked;

    private boolean initializationInvoked;

    private boolean stopInvoked;

    private boolean destroyInvoked;

    private MessageListener<?> messageListener;

    public MessageListenerTestContainer(AzureListenerEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    public AzureListenerEndpoint getEndpoint() {
        return this.endpoint;
    }

    public boolean isStarted() {
        return this.startInvoked && this.initializationInvoked;
    }

    public boolean isStopped() {
        return this.stopInvoked && this.destroyInvoked;
    }

    @Override
    public void setupMessageListener(MessageListener<?> messageListener) {
        this.messageListener = messageListener;
    }

    @Override
    public Object getContainerProperties() {
        return new Properties();
    }

    @Override
    public void start() {
        if (!this.initializationInvoked) {
            throw new IllegalStateException("afterPropertiesSet should have been invoked before start on " + this);
        }
        if (this.startInvoked) {
            throw new IllegalStateException("Start already invoked on " + this);
        }
        this.startInvoked = true;
    }

    @Override
    public void stop() {
        if (this.stopInvoked) {
            throw new IllegalStateException("Stop already invoked on " + this);
        }
        this.stopInvoked = true;
    }

    @Override
    public boolean isRunning() {
        return this.startInvoked && !this.stopInvoked;
    }

    @Override
    public int getPhase() {
        return 0;
    }

    @Override
    public boolean isAutoStartup() {
        return this.autoStartup;
    }

    public void setAutoStartup(boolean autoStartup) {
        this.autoStartup = autoStartup;
    }

    @Override
    public void stop(Runnable callback) {
        this.stopInvoked = true;
        callback.run();
    }

    @Override
    public void afterPropertiesSet() {
        this.initializationInvoked = true;
    }

    @Override
    public void destroy() {
        if (!this.stopInvoked) {
            throw new IllegalStateException("Stop should have been invoked before " + "destroy on " + this);
        }
        this.destroyInvoked = true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TestContainer{");
        sb.append("endpoint=").append(this.endpoint);
        sb.append(", startInvoked=").append(this.startInvoked);
        sb.append(", initializationInvoked=").append(this.initializationInvoked);
        sb.append(", stopInvoked=").append(this.stopInvoked);
        sb.append(", destroyInvoked=").append(this.destroyInvoked);
        sb.append('}');
        return sb.toString();
    }

}
