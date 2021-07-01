package ict.fot.ruh.ac.LiveDinner.Food.delivery.service;

import ict.fot.ruh.ac.LiveDinner.Food.delivery.model.Item;
import ict.fot.ruh.ac.LiveDinner.Food.delivery.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImp implements ItemService{

    @Autowired
    public ItemRepository itemRepository;

    @Override
    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }
}
