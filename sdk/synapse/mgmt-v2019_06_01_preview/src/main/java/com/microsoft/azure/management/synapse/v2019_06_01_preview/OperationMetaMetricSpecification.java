/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * What is this?.
 */
public class OperationMetaMetricSpecification {
    /**
     * The source MDM namespace.
     */
    @JsonProperty(value = "sourceMdmNamespace")
    private String sourceMdmNamespace;

    /**
     * Metric display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Metric unique name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Metric aggregation type.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /**
     * Metric description.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /**
     * The source MDM account.
     */
    @JsonProperty(value = "sourceMdmAccount")
    private String sourceMdmAccount;

    /**
     * Whether the regional MDM account is enabled.
     */
    @JsonProperty(value = "enableRegionalMdmAccount")
    private Boolean enableRegionalMdmAccount;

    /**
     * Metric units.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Metric dimensions.
     */
    @JsonProperty(value = "dimensions")
    private List<OperationMetaMetricDimensionSpecification> dimensions;

    /**
     * Whether the metric supports instance-level aggregation.
     */
    @JsonProperty(value = "supportsInstanceLevelAggregation")
    private Boolean supportsInstanceLevelAggregation;

    /**
     * Metric filter.
     */
    @JsonProperty(value = "metricFilterPattern")
    private String metricFilterPattern;

    /**
     * Get the source MDM namespace.
     *
     * @return the sourceMdmNamespace value
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the source MDM namespace.
     *
     * @param sourceMdmNamespace the sourceMdmNamespace value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get metric display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set metric display name.
     *
     * @param displayName the displayName value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get metric unique name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set metric unique name.
     *
     * @param name the name value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get metric aggregation type.
     *
     * @return the aggregationType value
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set metric aggregation type.
     *
     * @param aggregationType the aggregationType value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get metric description.
     *
     * @return the displayDescription value
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set metric description.
     *
     * @param displayDescription the displayDescription value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the source MDM account.
     *
     * @return the sourceMdmAccount value
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the source MDM account.
     *
     * @param sourceMdmAccount the sourceMdmAccount value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get whether the regional MDM account is enabled.
     *
     * @return the enableRegionalMdmAccount value
     */
    public Boolean enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set whether the regional MDM account is enabled.
     *
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withEnableRegionalMdmAccount(Boolean enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get metric units.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set metric units.
     *
     * @param unit the unit value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get metric dimensions.
     *
     * @return the dimensions value
     */
    public List<OperationMetaMetricDimensionSpecification> dimensions() {
        return this.dimensions;
    }

    /**
     * Set metric dimensions.
     *
     * @param dimensions the dimensions value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withDimensions(List<OperationMetaMetricDimensionSpecification> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get whether the metric supports instance-level aggregation.
     *
     * @return the supportsInstanceLevelAggregation value
     */
    public Boolean supportsInstanceLevelAggregation() {
        return this.supportsInstanceLevelAggregation;
    }

    /**
     * Set whether the metric supports instance-level aggregation.
     *
     * @param supportsInstanceLevelAggregation the supportsInstanceLevelAggregation value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withSupportsInstanceLevelAggregation(Boolean supportsInstanceLevelAggregation) {
        this.supportsInstanceLevelAggregation = supportsInstanceLevelAggregation;
        return this;
    }

    /**
     * Get metric filter.
     *
     * @return the metricFilterPattern value
     */
    public String metricFilterPattern() {
        return this.metricFilterPattern;
    }

    /**
     * Set metric filter.
     *
     * @param metricFilterPattern the metricFilterPattern value to set
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withMetricFilterPattern(String metricFilterPattern) {
        this.metricFilterPattern = metricFilterPattern;
        return this;
    }

}