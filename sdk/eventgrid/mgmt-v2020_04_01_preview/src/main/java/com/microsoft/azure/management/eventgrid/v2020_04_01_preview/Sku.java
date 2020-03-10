/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Sku.
 */
public final class Sku extends ExpandableStringEnum<Sku> {
    /** Static value Basic for Sku. */
    public static final Sku BASIC = fromString("Basic");

    /** Static value Premium for Sku. */
    public static final Sku PREMIUM = fromString("Premium");

    /**
     * Creates or finds a Sku from its string representation.
     * @param name a name to look for
     * @return the corresponding Sku
     */
    @JsonCreator
    public static Sku fromString(String name) {
        return fromString(name, Sku.class);
    }

    /**
     * @return known Sku values
     */
    public static Collection<Sku> values() {
        return values(Sku.class);
    }
}