// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: passbook-service.proto

package com.sample.grpcsample.passbookService;

public interface PassbookResponseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PassbookResponseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .PassBookDTO passbookDTO = 1;</code>
   */
  java.util.List<com.sample.grpcsample.passbookService.PassBookDTO> 
      getPassbookDTOList();
  /**
   * <code>repeated .PassBookDTO passbookDTO = 1;</code>
   */
  com.sample.grpcsample.passbookService.PassBookDTO getPassbookDTO(int index);
  /**
   * <code>repeated .PassBookDTO passbookDTO = 1;</code>
   */
  int getPassbookDTOCount();
  /**
   * <code>repeated .PassBookDTO passbookDTO = 1;</code>
   */
  java.util.List<? extends com.sample.grpcsample.passbookService.PassBookDTOOrBuilder> 
      getPassbookDTOOrBuilderList();
  /**
   * <code>repeated .PassBookDTO passbookDTO = 1;</code>
   */
  com.sample.grpcsample.passbookService.PassBookDTOOrBuilder getPassbookDTOOrBuilder(
      int index);
}
