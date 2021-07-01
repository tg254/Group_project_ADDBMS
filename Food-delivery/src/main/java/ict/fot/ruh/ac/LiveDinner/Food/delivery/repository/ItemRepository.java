package ict.fot.ruh.ac.LiveDinner.Food.delivery.repository;

import ict.fot.ruh.ac.LiveDinner.Food.delivery.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
