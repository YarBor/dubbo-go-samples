// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet.proto

package org.apache.dubbo.sample;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_dubbo_samples_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_dubbo_samples_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_dubbo_samples_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apache_dubbo_samples_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013greet.proto\022\030org.apache.dubbo.samples\"" +
      "\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"\035\n\nHelloRe" +
      "ply\022\017\n\007message\030\001 \001(\t2c\n\007Greeter\022X\n\010SayHe" +
      "llo\022&.org.apache.dubbo.samples.HelloRequ" +
      "est\032$.org.apache.dubbo.samples.HelloRepl" +
      "yB?\n\027org.apache.dubbo.sampleB\017HelloWorld" +
      "ProtoP\001Z\014/proto;proto\242\002\002WHb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_apache_dubbo_samples_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apache_dubbo_samples_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_dubbo_samples_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_org_apache_dubbo_samples_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_apache_dubbo_samples_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apache_dubbo_samples_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
