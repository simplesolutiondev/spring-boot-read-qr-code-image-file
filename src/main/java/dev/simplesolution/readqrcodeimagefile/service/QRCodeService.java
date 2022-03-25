package dev.simplesolution.readqrcodeimagefile.service;

import java.io.File;

public interface QRCodeService {
    String readQRCode(File qrCodeFile);
}
