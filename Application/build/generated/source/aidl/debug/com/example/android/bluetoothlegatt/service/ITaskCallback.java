/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/work/workspace/huami/mywearcompation/BluetoothLeGattSecond/Application/src/main/aidl/com/example/android/bluetoothlegatt/service/ITaskCallback.aidl
 */
package com.example.android.bluetoothlegatt.service;
// Declare any non-default types here with import statements

public interface ITaskCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.android.bluetoothlegatt.service.ITaskCallback
{
private static final java.lang.String DESCRIPTOR = "com.example.android.bluetoothlegatt.service.ITaskCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.android.bluetoothlegatt.service.ITaskCallback interface,
 * generating a proxy if needed.
 */
public static com.example.android.bluetoothlegatt.service.ITaskCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.android.bluetoothlegatt.service.ITaskCallback))) {
return ((com.example.android.bluetoothlegatt.service.ITaskCallback)iin);
}
return new com.example.android.bluetoothlegatt.service.ITaskCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_actionPerformed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.actionPerformed(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.android.bluetoothlegatt.service.ITaskCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void actionPerformed(java.lang.String result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(result);
mRemote.transact(Stub.TRANSACTION_actionPerformed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_actionPerformed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void actionPerformed(java.lang.String result) throws android.os.RemoteException;
}
