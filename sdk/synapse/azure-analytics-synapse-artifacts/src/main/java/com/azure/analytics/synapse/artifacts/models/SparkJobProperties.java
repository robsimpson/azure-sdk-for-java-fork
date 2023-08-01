// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The properties of the Spark job. */
@Fluent
public final class SparkJobProperties {
    /*
     * The name of the job.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * File containing the application to execute.
     */
    @JsonProperty(value = "file", required = true)
    private String file;

    /*
     * Main class for Java/Scala application.
     */
    @JsonProperty(value = "className")
    private String className;

    /*
     * Spark configuration properties.
     */
    @JsonProperty(value = "conf")
    private Object conf;

    /*
     * Command line arguments for the application.
     */
    @JsonProperty(value = "args")
    private List<String> args;

    /*
     * Jars to be used in this job.
     */
    @JsonProperty(value = "jars")
    private List<String> jars;

    /*
     * files to be used in this job.
     */
    @JsonProperty(value = "files")
    private List<String> files;

    /*
     * Archives to be used in this job.
     */
    @JsonProperty(value = "archives")
    private List<String> archives;

    /*
     * Amount of memory to use for the driver process.
     */
    @JsonProperty(value = "driverMemory", required = true)
    private String driverMemory;

    /*
     * Number of cores to use for the driver.
     */
    @JsonProperty(value = "driverCores", required = true)
    private int driverCores;

    /*
     * Amount of memory to use per executor process.
     */
    @JsonProperty(value = "executorMemory", required = true)
    private String executorMemory;

    /*
     * Number of cores to use for each executor.
     */
    @JsonProperty(value = "executorCores", required = true)
    private int executorCores;

    /*
     * Number of executors to launch for this job.
     */
    @JsonProperty(value = "numExecutors", required = true)
    private int numExecutors;

    /*
     * The properties of the Spark job.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of SparkJobProperties class. */
    public SparkJobProperties() {}

    /**
     * Get the name property: The name of the job.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the job.
     *
     * @param name the name value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the file property: File containing the application to execute.
     *
     * @return the file value.
     */
    public String getFile() {
        return this.file;
    }

    /**
     * Set the file property: File containing the application to execute.
     *
     * @param file the file value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * Get the className property: Main class for Java/Scala application.
     *
     * @return the className value.
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * Set the className property: Main class for Java/Scala application.
     *
     * @param className the className value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * Get the conf property: Spark configuration properties.
     *
     * @return the conf value.
     */
    public Object getConf() {
        return this.conf;
    }

    /**
     * Set the conf property: Spark configuration properties.
     *
     * @param conf the conf value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setConf(Object conf) {
        this.conf = conf;
        return this;
    }

    /**
     * Get the args property: Command line arguments for the application.
     *
     * @return the args value.
     */
    public List<String> getArgs() {
        return this.args;
    }

    /**
     * Set the args property: Command line arguments for the application.
     *
     * @param args the args value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setArgs(List<String> args) {
        this.args = args;
        return this;
    }

    /**
     * Get the jars property: Jars to be used in this job.
     *
     * @return the jars value.
     */
    public List<String> getJars() {
        return this.jars;
    }

    /**
     * Set the jars property: Jars to be used in this job.
     *
     * @param jars the jars value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setJars(List<String> jars) {
        this.jars = jars;
        return this;
    }

    /**
     * Get the files property: files to be used in this job.
     *
     * @return the files value.
     */
    public List<String> getFiles() {
        return this.files;
    }

    /**
     * Set the files property: files to be used in this job.
     *
     * @param files the files value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the archives property: Archives to be used in this job.
     *
     * @return the archives value.
     */
    public List<String> getArchives() {
        return this.archives;
    }

    /**
     * Set the archives property: Archives to be used in this job.
     *
     * @param archives the archives value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setArchives(List<String> archives) {
        this.archives = archives;
        return this;
    }

    /**
     * Get the driverMemory property: Amount of memory to use for the driver process.
     *
     * @return the driverMemory value.
     */
    public String getDriverMemory() {
        return this.driverMemory;
    }

    /**
     * Set the driverMemory property: Amount of memory to use for the driver process.
     *
     * @param driverMemory the driverMemory value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setDriverMemory(String driverMemory) {
        this.driverMemory = driverMemory;
        return this;
    }

    /**
     * Get the driverCores property: Number of cores to use for the driver.
     *
     * @return the driverCores value.
     */
    public int getDriverCores() {
        return this.driverCores;
    }

    /**
     * Set the driverCores property: Number of cores to use for the driver.
     *
     * @param driverCores the driverCores value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setDriverCores(int driverCores) {
        this.driverCores = driverCores;
        return this;
    }

    /**
     * Get the executorMemory property: Amount of memory to use per executor process.
     *
     * @return the executorMemory value.
     */
    public String getExecutorMemory() {
        return this.executorMemory;
    }

    /**
     * Set the executorMemory property: Amount of memory to use per executor process.
     *
     * @param executorMemory the executorMemory value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setExecutorMemory(String executorMemory) {
        this.executorMemory = executorMemory;
        return this;
    }

    /**
     * Get the executorCores property: Number of cores to use for each executor.
     *
     * @return the executorCores value.
     */
    public int getExecutorCores() {
        return this.executorCores;
    }

    /**
     * Set the executorCores property: Number of cores to use for each executor.
     *
     * @param executorCores the executorCores value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setExecutorCores(int executorCores) {
        this.executorCores = executorCores;
        return this;
    }

    /**
     * Get the numExecutors property: Number of executors to launch for this job.
     *
     * @return the numExecutors value.
     */
    public int getNumExecutors() {
        return this.numExecutors;
    }

    /**
     * Set the numExecutors property: Number of executors to launch for this job.
     *
     * @param numExecutors the numExecutors value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setNumExecutors(int numExecutors) {
        this.numExecutors = numExecutors;
        return this;
    }

    /**
     * Get the additionalProperties property: The properties of the Spark job.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The properties of the Spark job.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SparkJobProperties object itself.
     */
    public SparkJobProperties setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
