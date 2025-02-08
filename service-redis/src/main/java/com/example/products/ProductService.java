package com.example.products;

import com.github.benmanes.caffeine.cache.Cache;
lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductService.class);
    private final RedisTemplate<String, Object> redisTemplate;
    private final ProductRepository productRepository;
    private static final String PRODUCT_KEY_PREFIX = "product:";

    public Product saveProduct(Product product) {
        // TODO #1: 상품을 저장하는 메서드를 구현하세요.
        // 요구사항:
        // - 상품을 저장하고 반환해야 합니다.
        // - 저장 후 Redis 캐시에 1시간 동안 유지해야 합니다.
    }

    public Optional<Product> getProduct(Long id) {
        // TODO #2: 상품을 조회하는 메서드를 구현하세요.
        // 요구사항:
        // - Redis 캐시에서 상품을 먼저 조회해야 합니다.
        // - 캐시에 없을 경우 데이터베이스에서 조회하고 캐시에 저장해야 합니다.
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        // TODO #3: 상품 정보를 업데이트하는 메서드를 구현하세요.
        // 요구사항:
        // - 기존 상품이 존재하는지 확인해야 합니다.
        // - 존재하는 경우 데이터를 업데이트해야 합니다.
        // - 업데이트된 데이터를 Redis 캐시에도 반영해야 합니다.
    }

    public void deleteProduct(Long id) {
        // TODO #4: 상품을 삭제하는 메서드를 구현하세요.
        // 요구사항:
        // - 상품이 존재하는지 확인해야 합니다.
        // - 존재하는 경우 데이터베이스에서 삭제해야 합니다.
        // - Redis 캐시에서도 제거해야 합니다.
    }
}
