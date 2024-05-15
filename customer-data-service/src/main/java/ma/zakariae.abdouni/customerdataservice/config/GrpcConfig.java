package ma.zakariae.abdouni.customerdataservice.config;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Configuration;
@Configuration
@ImportAutoConfiguration({
        ma.devh.boot.grpc.common.autoconfigure.GrpcCommonCodecAutoConfiguration.class,
        ma.devh.boot.grpc.common.autoconfigure.GrpcCommonTraceAutoConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcAdviceAutoConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcHealthServiceAutoConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcMetadataConsulConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcMetadataEurekaConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcMetadataNacosConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcMetadataZookeeperConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcReflectionServiceAutoConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcServerAutoConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcServerFactoryAutoConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcServerMetricAutoConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcServerSecurityAutoConfiguration.class,
        ma.devh.boot.grpc.server.autoconfigure.GrpcServerTraceAutoConfiguration.class
})
class GrpcConfig {

}
