package Name.com.example.clinicmanagement.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Name.com.example.productlisting.entity.Size;
import Name.com.example.productlisting.repository.SizeRepository;
import Name.com.example.productlisting.service.SizeService;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {
    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public List<Size> getAllSizes() {
        return sizeRepository.findAll();
    }

    @Override
    public Size getSizeById(Long id) {
        return sizeRepository.findById(id).orElse(null);
    }

    @Override
    public Size createSize(Size size) {
        return sizeRepository.save(size);
    }

    @Override
    public Size updateSize(Long id, Size size) {
        size.setId(id);
        return sizeRepository.save(size);
    }

    @Override
    public void deleteSize(Long id) {
        sizeRepository.deleteById(id);
    }
}
