package Name.com.example.productlisting.service;


import java.util.List;

import Name.com.example.productlisting.entity.Size;

public interface SizeService {
    List<Size> getAllSizes();
    Size getSizeById(Long id);
    Size createSize(Size size);
    Size updateSize(Long id, Size size);
    void deleteSize(Long id);
}