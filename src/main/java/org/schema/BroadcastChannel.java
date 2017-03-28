/*
 * Copyright 2015-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
 */
public class BroadcastChannel extends Intangible {
  /**
   * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
   */
  @JsonIgnore public String getBroadcastChannelId() {
    return (String) getValue("broadcastChannelId");
  }
  /**
   * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
   */
  @JsonIgnore public Collection<String> getBroadcastChannelIds() {
    final Object current = myData.get("broadcastChannelId");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The CableOrSatelliteService offering the channel.
   */
  @JsonIgnore public CableOrSatelliteService getInBroadcastLineup() {
    return (CableOrSatelliteService) getValue("inBroadcastLineup");
  }
  /**
   * The CableOrSatelliteService offering the channel.
   */
  @JsonIgnore public Collection<CableOrSatelliteService> getInBroadcastLineups() {
    final Object current = myData.get("inBroadcastLineup");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CableOrSatelliteService>) current;
    }
    return Arrays.asList((CableOrSatelliteService) current);
  }
  /**
   * The type of service required to have access to the channel (e.g. Standard or Premium).
   */
  @JsonIgnore public String getBroadcastServiceTier() {
    return (String) getValue("broadcastServiceTier");
  }
  /**
   * The type of service required to have access to the channel (e.g. Standard or Premium).
   */
  @JsonIgnore public Collection<String> getBroadcastServiceTiers() {
    final Object current = myData.get("broadcastServiceTier");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The BroadcastService offered on this channel.
   */
  @JsonIgnore public BroadcastService getProvidesBroadcastService() {
    return (BroadcastService) getValue("providesBroadcastService");
  }
  /**
   * The BroadcastService offered on this channel.
   */
  @JsonIgnore public Collection<BroadcastService> getProvidesBroadcastServices() {
    final Object current = myData.get("providesBroadcastService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BroadcastService>) current;
    }
    return Arrays.asList((BroadcastService) current);
  }
  protected BroadcastChannel(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BroadcastChannel}
   */
  public static class Builder extends Intangible.Builder {
    @NotNull public BroadcastChannel build() {
      return new BroadcastChannel(myData);
    }
    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     */
    @NotNull public Builder broadcastChannelId(@NotNull String broadcastChannelId) {
      putValue("broadcastChannelId", broadcastChannelId);
      return this;
    }
    /**
     * The CableOrSatelliteService offering the channel.
     */
    @NotNull public Builder inBroadcastLineup(@NotNull CableOrSatelliteService cableOrSatelliteService) {
      putValue("inBroadcastLineup", cableOrSatelliteService);
      return this;
    }
    /**
     * The CableOrSatelliteService offering the channel.
     */
    @NotNull public Builder inBroadcastLineup(@NotNull CableOrSatelliteService.Builder cableOrSatelliteService) {
      putValue("inBroadcastLineup", cableOrSatelliteService.build());
      return this;
    }
    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     */
    @NotNull public Builder broadcastServiceTier(@NotNull String broadcastServiceTier) {
      putValue("broadcastServiceTier", broadcastServiceTier);
      return this;
    }
    /**
     * The BroadcastService offered on this channel.
     */
    @NotNull public Builder providesBroadcastService(@NotNull BroadcastService broadcastService) {
      putValue("providesBroadcastService", broadcastService);
      return this;
    }
    /**
     * The BroadcastService offered on this channel.
     */
    @NotNull public Builder providesBroadcastService(@NotNull BroadcastService.Builder broadcastService) {
      putValue("providesBroadcastService", broadcastService.build());
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("broadcastChannelId".equals(key) && value instanceof String) { broadcastChannelId((String)value); return; }
      if ("inBroadcastLineup".equals(key) && value instanceof CableOrSatelliteService) { inBroadcastLineup((CableOrSatelliteService)value); return; }
      if ("broadcastServiceTier".equals(key) && value instanceof String) { broadcastServiceTier((String)value); return; }
      if ("providesBroadcastService".equals(key) && value instanceof BroadcastService) { providesBroadcastService((BroadcastService)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
