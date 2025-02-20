package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.help.TLAbsTermsOfServiceUpdate;
import io.objects.tl.core.TLMethod;
import io.objects.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLRequestHelpGetTermsOfServiceUpdate extends TLMethod<TLAbsTermsOfServiceUpdate> {
    public static final int CONSTRUCTOR_ID = 0x2ca51fd1;

    private final String _constructor = "help.getTermsOfServiceUpdate#2ca51fd1";

    public TLRequestHelpGetTermsOfServiceUpdate() {
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsTermsOfServiceUpdate deserializeResponse(InputStream stream, TLContext context)
            throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsTermsOfServiceUpdate)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsTermsOfServiceUpdate) response;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}
