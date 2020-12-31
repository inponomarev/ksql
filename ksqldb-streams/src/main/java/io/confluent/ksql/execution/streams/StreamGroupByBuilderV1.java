/*
 * Copyright 2019 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.ksql.execution.streams;

import com.google.common.annotations.VisibleForTesting;
import io.confluent.ksql.execution.builder.KsqlQueryBuilder;

public final class StreamGroupByBuilderV1 extends StreamGroupByBuilderBase {

  public StreamGroupByBuilderV1(
      final KsqlQueryBuilder queryBuilder,
      final GroupedFactory groupedFactory
  ) {
    this(queryBuilder, groupedFactory, GroupByParamsV1Factory::build);
  }

  @VisibleForTesting
  StreamGroupByBuilderV1(
      final KsqlQueryBuilder queryBuilder,
      final GroupedFactory groupedFactory,
      final ParamsFactory paramsFactory
  ) {
    super(queryBuilder, groupedFactory, paramsFactory);
  }
}