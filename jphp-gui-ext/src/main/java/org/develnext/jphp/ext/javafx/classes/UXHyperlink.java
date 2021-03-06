package org.develnext.jphp.ext.javafx.classes;

import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Property;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name(JavaFXExtension.NS + "UXHyperlink")
public class UXHyperlink extends UXButtonBase {
    interface WrappedInterface {
        @Property boolean visited();
    }

    public UXHyperlink(Environment env, Hyperlink wrappedObject) {
        super(env, wrappedObject);
    }

    public UXHyperlink(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public Hyperlink getWrappedObject() {
        return (Hyperlink) super.getWrappedObject();
    }


    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new Hyperlink();
    }

    @Reflection.Signature
    public void __construct(String text) {
        __wrappedObject = new Hyperlink(text);
    }

    @Reflection.Signature
    public void __construct(String text, @Reflection.Nullable Node graphic) {
        __wrappedObject = new Hyperlink(text, graphic);
    }
}
