package com.backend.Netflix.DTO;

import org.springframework.web.multipart.MultipartFile;

public record MediaRequestMultiform(
        MultipartFile videoPart,
        MultipartFile thumbnailPart,
        String titleBody,
        String descriptionBody,
        String genreBody,
        Integer yearBody,
        String publisherBody,
        Integer durationBody
) {}