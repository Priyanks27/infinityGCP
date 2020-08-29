package com.lyit.multicloud.InventoryService.repository;

import com.lyit.multicloud.InventoryService.data.models.InventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryModel, UUID> {
    Optional<List<InventoryModel>> findAllByCategory(String category);
}
