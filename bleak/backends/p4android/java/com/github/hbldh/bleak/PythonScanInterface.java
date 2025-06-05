package com.github.hbldh.bleak;

public interface PythonScanInterface
{
    public void onScanFailed(int code);
    public void onScanResult(ScanResult result);
}