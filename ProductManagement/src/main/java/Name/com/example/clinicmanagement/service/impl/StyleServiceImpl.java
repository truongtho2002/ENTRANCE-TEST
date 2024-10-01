package Name.com.example.clinicmanagement.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Name.com.example.productlisting.entity.Style;
import Name.com.example.productlisting.repository.StyleRepository;
import Name.com.example.productlisting.service.StyleService;

import java.util.List;

@Service
public class StyleServiceImpl implements StyleService {
    @Autowired
    private StyleRepository styleRepository;

    @Override
    public List<Style> getAllStyles() {
        return styleRepository.findAll();
    }

    @Override
    public Style getStyleById(Long id) {
        return styleRepository.findById(id).orElse(null);
    }

    @Override
    public Style createStyle(Style style) {
        return styleRepository.save(style);
    }

    @Override
    public Style updateStyle(Long id, Style style) {
        style.setId(id);
        return styleRepository.save(style);
    }

    @Override
    public void deleteStyle(Long id) {
        styleRepository.deleteById(id);
    }
}