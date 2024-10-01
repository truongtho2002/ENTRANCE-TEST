package Name.com.example.productlisting.service;


import java.util.List;

import Name.com.example.productlisting.entity.Style;

public interface StyleService {
    List<Style> getAllStyles();
    Style getStyleById(Long id);
    Style createStyle(Style style);
    Style updateStyle(Long id, Style style);
    void deleteStyle(Long id);
}
