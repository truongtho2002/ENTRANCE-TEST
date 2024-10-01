package Name.com.example.productlisting.service;


import java.util.List;

import Name.com.example.productlisting.entity.Color;

public interface ColorService {
    List<Color> getAllColors();
    Color getColorById(Long id);
    Color createColor(Color color);
    Color updateColor(Long id, Color color);
    void deleteColor(Long id);
}
