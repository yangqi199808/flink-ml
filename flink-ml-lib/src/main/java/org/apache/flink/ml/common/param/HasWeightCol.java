/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.ml.common.param;

import org.apache.flink.ml.param.Param;
import org.apache.flink.ml.param.StringParam;
import org.apache.flink.ml.param.WithParams;

/**
 * Interface for the shared weight column param. If this is not set, we treat all instance weights
 * as 1.0.
 */
public interface HasWeightCol<T> extends WithParams<T> {
    Param<String> WEIGHT_COL = new StringParam("weightCol", "Weight column name.", null);

    default String getWeightCol() {
        return get(WEIGHT_COL);
    }

    default T setWeightCol(String colName) {
        return set(WEIGHT_COL, colName);
    }
}
