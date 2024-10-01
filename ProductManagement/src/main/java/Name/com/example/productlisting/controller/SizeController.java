package Name.com.example.productlisting.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Name.com.example.productlisting.entity.Size;
import Name.com.example.productlisting.service.SizeService;

import java.util.List;

@RestController
@RequestMapping("/api/sizes")
public class SizeController {
    @Autowired
    private SizeService sizeService;

    @GetMapping
    public List<Size> getAllSizes() {
        return sizeService.getAllSizes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Size> getSizeById(@PathVariable Long id) {
        Size size = sizeService.getSizeById(id);
        return ResponseEntity.ok(size);
    }

    @PostMapping
    public Size createSize(@RequestBody Size size) {
        return sizeService.createSize(size);
    }

    @PutMapping("/{id}")
    public Size updateSize(@PathVariable Long id, @RequestBody Size size) {
        return sizeService.updateSize(id, size);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSize(@PathVariable Long id) {
        sizeService.deleteSize(id);
        return ResponseEntity.noContent().build();
    }
}
