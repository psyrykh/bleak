package com.github.hbldh.bleak;

import java.util.List;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;

public final class PythonScanCallback extends ScanCallback
{
    private PythonScanInterface callback;

    public PythonScanCallback(PythonScanInterface pythonCallback)
    {
        callback = pythonCallback;
    }

    @Override
    public void onBatchScanResults(List<ScanResult> results)
    {
        for (ScanResult result : results) {
            callback.onScanResult(result);
        }
    }

    @Override
    public void onScanFailed(int errorCode)
    {
        callback.onScanFailed(errorCode);
    }

    @Override
    public void onScanResult(int callbackType, ScanResult result)
    {
        callback.onScanResult(result);
    }
}
