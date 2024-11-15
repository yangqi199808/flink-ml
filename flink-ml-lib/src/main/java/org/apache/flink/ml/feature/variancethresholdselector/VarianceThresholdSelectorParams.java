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

package org.apache.flink.ml.feature.variancethresholdselector;

import org.apache.flink.ml.param.DoubleParam;
import org.apache.flink.ml.param.Param;
import org.apache.flink.ml.param.ParamValidators;

/**
 * Params of VarianceThresholdSelectorModel.
 *
 * @param <T> The class type of this instance.
 */
public interface VarianceThresholdSelectorParams<T>
        extends VarianceThresholdSelectorModelParams<T> {

    Param<Double> VARIANCE_THRESHOLD =
            new DoubleParam(
                    "varianceThreshold",
                    "Features with a variance not greater than this threshold will be removed.",
                    0.0,
                    ParamValidators.gtEq(0.0));

    default double getVarianceThreshold() {
        return get(VARIANCE_THRESHOLD);
    }

    default T setVarianceThreshold(double value) {
        return set(VARIANCE_THRESHOLD, value);
    }
}
