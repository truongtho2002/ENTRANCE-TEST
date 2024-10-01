package Name.com.example.clinicmanagement.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Name.com.example.productlisting.entity.Color;
import Name.com.example.productlisting.repository.ColorRepository;
import Name.com.example.productlisting.service.ColorService;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    private ColorRepository colorRepository;

    @Override
    public List<Color> getAllColors() {
        return colorRepository.findAll();
    }

    @Override
    public Color getColorById(Long id) {
        return colorRepository.findById(id).orElse(null);
    }

    @Override
    public Color createColor(Color color) {
        return colorRepository.save(color);
    }

    @Override
    public Color updateColor(Long id, Color color) {
        color.setId(id);
        return colorRepository.save(color);
    }

    @Override
    public void deleteColor(Long id) {
        colorRepository.deleteById(id);
    }
}
