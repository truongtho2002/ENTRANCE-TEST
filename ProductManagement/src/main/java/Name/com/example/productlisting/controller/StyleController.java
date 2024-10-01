package Name.com.example.productlisting.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Name.com.example.productlisting.entity.Style;
import Name.com.example.productlisting.service.StyleService;

import java.util.List;

@RestController
@RequestMapping("/api/styles")
public class StyleController {
    @Autowired
    private StyleService styleService;

    @GetMapping
    public List<Style> getAllStyles() {
        return styleService.getAllStyles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Style> getStyleById(@PathVariable Long id) {
        Style style = styleService.getStyleById(id);
        return ResponseEntity.ok(style);
    }

    @PostMapping
    public Style createStyle(@RequestBody Style style) {
        return styleService.createStyle(style);
    }

    @PutMapping("/{id}")
    public Style updateStyle(@PathVariable Long id, @RequestBody Style style) {
        return styleService.updateStyle(id, style);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStyle(@PathVariable Long id) {
        styleService.deleteStyle(id);
        return ResponseEntity.noContent().build();
    }
}