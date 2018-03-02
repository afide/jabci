// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

public interface ResponseCheckTxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.jtendermint.jabci.types.ResponseCheckTx)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 code = 1;</code>
   */
  int getCode();

  /**
   * <code>optional bytes data = 2;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>optional string log = 3;</code>
   */
  java.lang.String getLog();
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>optional string log = 3;</code>
   */
  com.google.protobuf.ByteString
      getLogBytes();

  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>optional string info = 4;</code>
   */
  java.lang.String getInfo();
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>optional string info = 4;</code>
   */
  com.google.protobuf.ByteString
      getInfoBytes();

  /**
   * <code>optional int64 gas_wanted = 5;</code>
   */
  long getGasWanted();

  /**
   * <pre>
   * int64 gas_used = 6;
   * </pre>
   *
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  java.util.List<com.github.jtendermint.jabci.types.KVPair> 
      getTagsList();
  /**
   * <pre>
   * int64 gas_used = 6;
   * </pre>
   *
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  com.github.jtendermint.jabci.types.KVPair getTags(int index);
  /**
   * <pre>
   * int64 gas_used = 6;
   * </pre>
   *
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * int64 gas_used = 6;
   * </pre>
   *
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  java.util.List<? extends com.github.jtendermint.jabci.types.KVPairOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <pre>
   * int64 gas_used = 6;
   * </pre>
   *
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  com.github.jtendermint.jabci.types.KVPairOrBuilder getTagsOrBuilder(
      int index);

  /**
   * <code>optional .com.github.jtendermint.jabci.types.KI64Pair fee = 8;</code>
   */
  boolean hasFee();
  /**
   * <code>optional .com.github.jtendermint.jabci.types.KI64Pair fee = 8;</code>
   */
  com.github.jtendermint.jabci.types.KI64Pair getFee();
  /**
   * <code>optional .com.github.jtendermint.jabci.types.KI64Pair fee = 8;</code>
   */
  com.github.jtendermint.jabci.types.KI64PairOrBuilder getFeeOrBuilder();
}
