/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

public interface RunAggregationQueryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.RunAggregationQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name. In the format:
   * `projects/{project_id}/databases/{database_id}/documents` or
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * For example:
   * `projects/my-project/databases/my-database/documents` or
   * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name. In the format:
   * `projects/{project_id}/databases/{database_id}/documents` or
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * For example:
   * `projects/my-project/databases/my-database/documents` or
   * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * An aggregation query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredAggregationQuery structured_aggregation_query = 2;</code>
   *
   * @return Whether the structuredAggregationQuery field is set.
   */
  boolean hasStructuredAggregationQuery();
  /**
   *
   *
   * <pre>
   * An aggregation query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredAggregationQuery structured_aggregation_query = 2;</code>
   *
   * @return The structuredAggregationQuery.
   */
  com.google.firestore.v1.StructuredAggregationQuery getStructuredAggregationQuery();
  /**
   *
   *
   * <pre>
   * An aggregation query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredAggregationQuery structured_aggregation_query = 2;</code>
   */
  com.google.firestore.v1.StructuredAggregationQueryOrBuilder
      getStructuredAggregationQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * Run the aggregation within an already active transaction.
   * The value here is the opaque transaction ID to execute the query in.
   * </pre>
   *
   * <code>bytes transaction = 4;</code>
   *
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * Run the aggregation within an already active transaction.
   * The value here is the opaque transaction ID to execute the query in.
   * </pre>
   *
   * <code>bytes transaction = 4;</code>
   *
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   *
   *
   * <pre>
   * Starts a new transaction as part of the query, defaulting to read-only.
   * The new transaction ID will be returned as the first response in the
   * stream.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions new_transaction = 5;</code>
   *
   * @return Whether the newTransaction field is set.
   */
  boolean hasNewTransaction();
  /**
   *
   *
   * <pre>
   * Starts a new transaction as part of the query, defaulting to read-only.
   * The new transaction ID will be returned as the first response in the
   * stream.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions new_transaction = 5;</code>
   *
   * @return The newTransaction.
   */
  com.google.firestore.v1.TransactionOptions getNewTransaction();
  /**
   *
   *
   * <pre>
   * Starts a new transaction as part of the query, defaulting to read-only.
   * The new transaction ID will be returned as the first response in the
   * stream.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions new_transaction = 5;</code>
   */
  com.google.firestore.v1.TransactionOptionsOrBuilder getNewTransactionOrBuilder();

  /**
   *
   *
   * <pre>
   * Executes the query at the given timestamp.
   * Requires:
   * * Cannot be more than 270 seconds in the past.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 6;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Executes the query at the given timestamp.
   * Requires:
   * * Cannot be more than 270 seconds in the past.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 6;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Executes the query at the given timestamp.
   * Requires:
   * * Cannot be more than 270 seconds in the past.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  public com.google.firestore.v1.RunAggregationQueryRequest.QueryTypeCase getQueryTypeCase();

  public com.google.firestore.v1.RunAggregationQueryRequest.ConsistencySelectorCase
      getConsistencySelectorCase();
}