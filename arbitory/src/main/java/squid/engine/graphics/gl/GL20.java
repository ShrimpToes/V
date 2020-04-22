package squid.engine.graphics.gl;

import java.nio.*;

public interface GL20 {
    /** Accepted by the {@code name} parameter of GetString. */
    int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;
    /** Accepted by the {@code pname} parameter of GetInteger. */
    int GL_CURRENT_PROGRAM = 0x8B8D;
    /** Accepted by the {@code pname} parameter of GetShaderiv. */
    int
        GL_SHADER_TYPE                 = 0x8B4F;
    int GL_DELETE_STATUS               = 0x8B80;
    int GL_COMPILE_STATUS              = 0x8B81;
    int GL_LINK_STATUS                 = 0x8B82;
    int GL_VALIDATE_STATUS             = 0x8B83;
    int GL_INFO_LOG_LENGTH             = 0x8B84;
    int GL_ATTACHED_SHADERS            = 0x8B85;
    int GL_ACTIVE_UNIFORMS             = 0x8B86;
    int GL_ACTIVE_UNIFORM_MAX_LENGTH   = 0x8B87;
    int GL_ACTIVE_ATTRIBUTES           = 0x8B89;
    int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
    int GL_SHADER_SOURCE_LENGTH        = 0x8B88;
    /** Returned by the {@code type} parameter of GetActiveUniform. */
    int
        GL_FLOAT_VEC2        = 0x8B50;
    int GL_FLOAT_VEC3        = 0x8B51;
    int GL_FLOAT_VEC4        = 0x8B52;
    int GL_INT_VEC2          = 0x8B53;
    int GL_INT_VEC3          = 0x8B54;
    int GL_INT_VEC4          = 0x8B55;
    int GL_BOOL              = 0x8B56;
    int GL_BOOL_VEC2         = 0x8B57;
    int GL_BOOL_VEC3         = 0x8B58;
    int GL_BOOL_VEC4         = 0x8B59;
    int GL_FLOAT_MAT2        = 0x8B5A;
    int GL_FLOAT_MAT3        = 0x8B5B;
    int GL_FLOAT_MAT4        = 0x8B5C;
    int GL_SAMPLER_1D        = 0x8B5D;
    int GL_SAMPLER_2D        = 0x8B5E;
    int GL_SAMPLER_3D        = 0x8B5F;
    int GL_SAMPLER_CUBE      = 0x8B60;
    int GL_SAMPLER_1D_SHADOW = 0x8B61;
    int GL_SAMPLER_2D_SHADOW = 0x8B62;
    /** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
    int GL_VERTEX_SHADER = 0x8B31;
    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    int
        GL_MAX_VERTEX_UNIFORM_COMPONENTS    = 0x8B4A;
    int GL_MAX_VARYING_FLOATS               = 0x8B4B;
    int GL_MAX_VERTEX_ATTRIBS               = 0x8869;
    int GL_MAX_TEXTURE_IMAGE_UNITS          = 0x8872;
    int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS   = 0x8B4C;
    int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
    /**
     * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;
    /** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}v. */
    int
        GL_VERTEX_ATTRIB_ARRAY_ENABLED    = 0x8622;
    int GL_VERTEX_ATTRIB_ARRAY_SIZE       = 0x8623;
    int GL_VERTEX_ATTRIB_ARRAY_STRIDE     = 0x8624;
    int GL_VERTEX_ATTRIB_ARRAY_TYPE       = 0x8625;
    int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
    int GL_CURRENT_VERTEX_ATTRIB          = 0x8626;
    /** Accepted by the {@code pname} parameter of GetVertexAttribPointerv. */
    int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
    /** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
    int GL_FRAGMENT_SHADER = 0x8B30;
    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
    /** Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
    int
        GL_MAX_DRAW_BUFFERS = 0x8824;
    int GL_DRAW_BUFFER0     = 0x8825;
    int GL_DRAW_BUFFER1     = 0x8826;
    int GL_DRAW_BUFFER2     = 0x8827;
    int GL_DRAW_BUFFER3     = 0x8828;
    int GL_DRAW_BUFFER4     = 0x8829;
    int GL_DRAW_BUFFER5     = 0x882A;
    int GL_DRAW_BUFFER6     = 0x882B;
    int GL_DRAW_BUFFER7     = 0x882C;
    int GL_DRAW_BUFFER8     = 0x882D;
    int GL_DRAW_BUFFER9     = 0x882E;
    int GL_DRAW_BUFFER10    = 0x882F;
    int GL_DRAW_BUFFER11    = 0x8830;
    int GL_DRAW_BUFFER12    = 0x8831;
    int GL_DRAW_BUFFER13    = 0x8832;
    int GL_DRAW_BUFFER14    = 0x8833;
    int GL_DRAW_BUFFER15    = 0x8834;
    /** Accepted by the {@code pname} parameter of PointParameter{if}v. */
    int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
    /** Accepted by the {@code param} parameter of PointParameter{if}v. */
    int
        GL_LOWER_LEFT = 0x8CA1;
    int GL_UPPER_LEFT = 0x8CA2;
    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    int
        GL_BLEND_EQUATION_RGB   = 0x8009;
    int GL_BLEND_EQUATION_ALPHA = 0x883D;
    /** Accepted by the {@code pname} parameter of GetIntegerv. */
    int
        GL_STENCIL_BACK_FUNC            = 0x8800;
    int GL_STENCIL_BACK_FAIL            = 0x8801;
    int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
    int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
    int GL_STENCIL_BACK_REF             = 0x8CA3;
    int GL_STENCIL_BACK_VALUE_MASK      = 0x8CA4;
    int GL_STENCIL_BACK_WRITEMASK       = 0x8CA5;

    /**
     * Creates a program object.
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glCreateProgram">Reference Page</a>
     */

    int glCreateProgram();

    /**
     * Deletes a program object.
     *
     * @param program the program object to be deleted
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteProgram">Reference Page</a>
     */
    void glDeleteProgram(int program);

    /**
     * Returns {@link org.lwjgl.opengl.GL11#GL_TRUE TRUE} if {@code program} is the name of a program object. If {@code program} is zero, or a non-zero value that is not the name of a program
     * object, IsProgram returns {@link GL11#GL_FALSE FALSE}. No error is generated if program is not a valid program object name.
     *
     * @param program the program object name to query
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsProgram">Reference Page</a>
     */

    boolean glIsProgram(int program);

    int glCreateShader(int type);

    /**
     * Deletes a shader object.
     *
     * @param shader the shader object to be deleted
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteShader">Reference Page</a>
     */
    void glDeleteShader(int shader);

    /**
     * Returns {@link GL11#GL_TRUE TRUE} if {@code shader} is the name of a shader object. If {@code shader} is zero, or a nonzero value that is not the name of a shader
     * object, IsShader returns {@link GL11#GL_FALSE FALSE}. No error is generated if shader is not a valid shader object name.
     *
     * @param shader the shader object name to query
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsShader">Reference Page</a>
     */

    boolean glIsShader(int shader);

    /**
     * Attaches a shader object to a program object.
     *
     * <p>In order to create a complete shader program, there must be a way to specify the list of things that will be linked together. Program objects provide
     * this mechanism. Shaders that are to be linked together in a program object must first be attached to that program object. glAttachShader attaches the
     * shader object specified by shader to the program object specified by program. This indicates that shader will be included in link operations that will
     * be performed on program.</p>
     *
     * <p>All operations that can be performed on a shader object are valid whether or not the shader object is attached to a program object. It is permissible to
     * attach a shader object to a program object before source code has been loaded into the shader object or before the shader object has been compiled. It
     * is permissible to attach multiple shader objects of the same type because each may contain a portion of the complete shader. It is also permissible to
     * attach a shader object to more than one program object. If a shader object is deleted while it is attached to a program object, it will be flagged for
     * deletion, and deletion will not occur until glDetachShader is called to detach it from all program objects to which it is attached.</p>
     *
     * @param program the program object to which a shader object will be attached
     * @param shader  the shader object that is to be attached
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glAttachShader">Reference Page</a>
     */
    void glAttachShader(int program, int shader);

    /**
     * Detaches a shader object from a program object to which it is attached.
     *
     * @param program the program object from which to detach the shader object
     * @param shader  the shader object to be detached
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glDetachShader">Reference Page</a>
     */
    void glDetachShader(int program, int shader);

    /**
     * Unsafe version of: {@link #glShaderSource ShaderSource}
     *
     * @param count the number of elements in the string and length arrays
     */
    void nglShaderSource(int shader, int count, long strings, long length);

    /**
     * Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
     * shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is {@code NULL}, each string is
     * assumed to be null terminated. If {@code length} is a value other than {@code NULL}, it points to an array containing a string length for each of the
     * corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
     * counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
     * parsed at this time; they are simply copied into the specified shader object.
     *
     * @param shader  the shader object whose source code is to be replaced
     * @param strings an array of pointers to strings containing the source code to be loaded into the shader
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glShaderSource">Reference Page</a>
     */
    void glShaderSource(int shader, CharSequence... strings);

    /**
     * Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
     * shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is {@code NULL}, each string is
     * assumed to be null terminated. If {@code length} is a value other than {@code NULL}, it points to an array containing a string length for each of the
     * corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
     * counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
     * parsed at this time; they are simply copied into the specified shader object.
     *
     * @param shader the shader object whose source code is to be replaced
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glShaderSource">Reference Page</a>
     */
    void glShaderSource(int shader, CharSequence string);

    /**
     * Compiles a shader object.
     *
     * @param shader the shader object to be compiled
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glCompileShader">Reference Page</a>
     */
    void glCompileShader(int shader);

    /**
     * Links a program object.
     *
     * @param program the program object to be linked
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glLinkProgram">Reference Page</a>
     */
    void glLinkProgram(int program);

    /**
     * Installs a program object as part of current rendering state.
     *
     * @param program the program object whose executables are to be used as part of current rendering state
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUseProgram">Reference Page</a>
     */
    void glUseProgram(int program);

    /**
     * Validates a program object.
     *
     * @param program the program object to be validated
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glValidateProgram">Reference Page</a>
     */
    void glValidateProgram(int program);

    /**
     * Specifies the value of a float uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform value
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform1f(int location, float v0);

    /**
     * Specifies the value of a vec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform2f(int location, float v0, float v1);

    /**
     * Specifies the value of a vec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform3f(int location, float v0, float v1, float v2);

    /**
     * Specifies the value of a vec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * @param v3       the uniform w value
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform4f(int location, float v0, float v1, float v2, float v3);

    /**
     * Specifies the value of an int uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform value
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform1i(int location, int v0);

    /**
     * Specifies the value of an ivec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform2i(int location, int v0, int v1);

    /**
     * Specifies the value of an ivec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform3i(int location, int v0, int v1, int v2);

    /**
     * Specifies the value of an ivec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * @param v3       the uniform w value
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform4i(int location, int v0, int v1, int v2, int v3);

    /**
     * Unsafe version of: {@link #glUniform1fv Uniform1fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    void nglUniform1fv(int location, int count, long value);

    /**
     * Specifies the value of a single float uniform variable or a float uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform1fv(int location, FloatBuffer value);

    /**
     * Unsafe version of: {@link #glUniform2fv Uniform2fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    void nglUniform2fv(int location, int count, long value);

    /**
     * Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform2fv(int location, FloatBuffer value);

    /**
     * Unsafe version of: {@link #glUniform3fv Uniform3fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    void nglUniform3fv(int location, int count, long value);

    /**
     * Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform3fv(int location, FloatBuffer value);

    /**
     * Unsafe version of: {@link #glUniform4fv Uniform4fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    void nglUniform4fv(int location, int count, long value);

    /**
     * Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform4fv(int location, FloatBuffer value);

    /**
     * Unsafe version of: {@link #glUniform1iv Uniform1iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    void nglUniform1iv(int location, int count, long value);

    /**
     * Specifies the value of a single int uniform variable or a int uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform1iv(int location, IntBuffer value);

    /**
     * Unsafe version of: {@link #glUniform2iv Uniform2iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    void nglUniform2iv(int location, int count, long value);

    /**
     * Specifies the value of a single ivec2 uniform variable or an ivec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform2iv(int location, IntBuffer value);

    /**
     * Unsafe version of: {@link #glUniform3iv Uniform3iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    void nglUniform3iv(int location, int count, long value);

    /**
     * Specifies the value of a single ivec3 uniform variable or an ivec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform3iv(int location, IntBuffer value);

    /**
     * Unsafe version of: {@link #glUniform4iv Uniform4iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    void nglUniform4iv(int location, int count, long value);

    /**
     * Specifies the value of a single ivec4 uniform variable or an ivec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform4iv(int location, IntBuffer value);

    /**
     * Unsafe version of: {@link #glUniformMatrix2fv UniformMatrix2fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    void nglUniformMatrix2fv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value);

    /**
     * Unsafe version of: {@link #glUniformMatrix3fv UniformMatrix3fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    void nglUniformMatrix3fv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value);

    /**
     * Unsafe version of: {@link #glUniformMatrix4fv UniformMatrix4fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    void nglUniformMatrix4fv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value);

    /** Unsafe version of: {@link #glGetShaderiv GetShaderiv} */
    void nglGetShaderiv(int shader, int pname, long params);

    /**
     * Returns a parameter from a shader object.
     *
     * @param shader the shader object to be queried
     * @param pname  the object parameter. One of:<br><table><tr><td>{@link #GL_SHADER_TYPE SHADER_TYPE}</td><td>{@link #GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link #GL_COMPILE_STATUS COMPILE_STATUS}</td><td>{@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link #GL_SHADER_SOURCE_LENGTH SHADER_SOURCE_LENGTH}</td></tr></table>
     * @param params the requested object parameter
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShader">Reference Page</a>
     */
    void glGetShaderiv(int shader, int pname, IntBuffer params);

    /**
     * Returns a parameter from a shader object.
     *
     * @param shader the shader object to be queried
     * @param pname  the object parameter. One of:<br><table><tr><td>{@link #GL_SHADER_TYPE SHADER_TYPE}</td><td>{@link #GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link #GL_COMPILE_STATUS COMPILE_STATUS}</td><td>{@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link #GL_SHADER_SOURCE_LENGTH SHADER_SOURCE_LENGTH}</td></tr></table>
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShader">Reference Page</a>
     */

    int glGetShaderi(int shader, int pname);

    /** Unsafe version of: {@link #glGetProgramiv GetProgramiv} */
    void nglGetProgramiv(int program, int pname, long params);

    void glGetProgramiv(int program, int pname, IntBuffer params);

    int glGetProgrami(int program, int pname);

    /**
     * Unsafe version of: {@link #glGetShaderInfoLog GetShaderInfoLog}
     *
     * @param maxLength the size of the character buffer for storing the returned information log
     */
    void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog);

    /**
     * Returns the information log for a shader object.
     *
     * @param shader  the shader object whose information log is to be queried
     * @param length  the length of the string returned in {@code infoLog} (excluding the null terminator)
     * @param infoLog an array of characters that is used to return the information log
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>
     */
    void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog);

    /**
     * Returns the information log for a shader object.
     *
     * @param shader    the shader object whose information log is to be queried
     * @param maxLength the size of the character buffer for storing the returned information log
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>
     */

    String glGetShaderInfoLog(int shader, int maxLength);

    /**
     * Returns the information log for a shader object.
     *
     * @param shader the shader object whose information log is to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>
     */

    String glGetShaderInfoLog(int shader);

    /**
     * Unsafe version of: {@link #glGetProgramInfoLog GetProgramInfoLog}
     *
     * @param maxLength the size of the character buffer for storing the returned information log
     */
    void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog);

    /**
     * Returns the information log for a program object.
     *
     * @param program the program object whose information log is to be queried
     * @param length  the length of the string returned in {@code infoLog} (excluding the null terminator)
     * @param infoLog an array of characters that is used to return the information log
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>
     */
    void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog);

    /**
     * Returns the information log for a program object.
     *
     * @param program   the program object whose information log is to be queried
     * @param maxLength the size of the character buffer for storing the returned information log
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>
     */

    String glGetProgramInfoLog(int program, int maxLength);

    /**
     * Returns the information log for a program object.
     *
     * @param program the program object whose information log is to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>
     */

    String glGetProgramInfoLog(int program);

    /**
     * Unsafe version of: {@link #glGetAttachedShaders GetAttachedShaders}
     *
     * @param maxCount the size of the array for storing the returned object names
     */
    void nglGetAttachedShaders(int program, int maxCount, long count, long shaders);

    /**
     * Returns the shader objects attached to a program object.
     *
     * @param program the program object to be queried
     * @param count   the number of names actually returned in {@code shaders}
     * @param shaders an array that is used to return the names of attached shader objects
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetAttachedShaders">Reference Page</a>
     */
    void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders);

    /** Unsafe version of: {@link #glGetUniformLocation GetUniformLocation} */
    int nglGetUniformLocation(int program, long name);

    /**
     * Returns the location of a uniform variable.
     *
     * @param program the program object to be queried
     * @param name    a null terminated string containing the name of the uniform variable whose location is to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniformLocation">Reference Page</a>
     */
    int glGetUniformLocation(int program, ByteBuffer name);

    /**
     * Returns the location of a uniform variable.
     *
     * @param program the program object to be queried
     * @param name    a null terminated string containing the name of the uniform variable whose location is to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniformLocation">Reference Page</a>
     */
    int glGetUniformLocation(int program, CharSequence name);

    /**
     * Unsafe version of: {@link #glGetActiveUniform GetActiveUniform}
     *
     * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
     */
    void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name);

    /**
     * Returns information about an active uniform variable for the specified program object.
     *
     * @param program the program object to be queried
     * @param index   the index of the uniform variable to be queried
     * @param length  the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed
     * @param size    the size of the uniform variable
     * @param type    the data type of the uniform variable
     * @param name    a null terminated string containing the name of the uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveUniform">Reference Page</a>
     */
    void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    /**
     * Returns information about an active uniform variable for the specified program object.
     *
     * @param program   the program object to be queried
     * @param index     the index of the uniform variable to be queried
     * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
     * @param size      the size of the uniform variable
     * @param type      the data type of the uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveUniform">Reference Page</a>
     */

    String glGetActiveUniform(int program, int index, int maxLength, IntBuffer size, IntBuffer type);

    /**
     * Returns information about an active uniform variable for the specified program object.
     *
     * @param program the program object to be queried
     * @param index   the index of the uniform variable to be queried
     * @param size    the size of the uniform variable
     * @param type    the data type of the uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveUniform">Reference Page</a>
     */

    String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type);

    /** Unsafe version of: {@link #glGetUniformfv GetUniformfv} */
    void nglGetUniformfv(int program, int location, long params);

    /**
     * Returns the float value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    void glGetUniformfv(int program, int location, FloatBuffer params);

    /**
     * Returns the float value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */

    float glGetUniformf(int program, int location);

    /** Unsafe version of: {@link #glGetUniformiv GetUniformiv} */
    void nglGetUniformiv(int program, int location, long params);

    /**
     * Returns the int value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    void glGetUniformiv(int program, int location, IntBuffer params);

    /**
     * Returns the int value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */

    int glGetUniformi(int program, int location);

    /**
     * Unsafe version of: {@link #glGetShaderSource GetShaderSource}
     *
     * @param maxLength the size of the character buffer for storing the returned source code string
     */
    void nglGetShaderSource(int shader, int maxLength, long length, long source);

    /**
     * Returns the source code string from a shader object.
     *
     * @param shader the shader object to be queried
     * @param length the length of the string returned in source (excluding the null terminator)
     * @param source an array of characters that is used to return the source code string
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderSource">Reference Page</a>
     */
    void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source);

    /**
     * Returns the source code string from a shader object.
     *
     * @param shader    the shader object to be queried
     * @param maxLength the size of the character buffer for storing the returned source code string
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderSource">Reference Page</a>
     */

    String glGetShaderSource(int shader, int maxLength);

    /**
     * Returns the source code string from a shader object.
     *
     * @param shader the shader object to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderSource">Reference Page</a>
     */

    String glGetShaderSource(int shader);

    /**
     * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1f(int index, float v0);

    /**
     * Short version of {@link #glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1s(int index, short v0);

    /**
     * Double version of {@link #glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1d(int index, double v0);

    /**
     * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2f(int index, float v0, float v1);

    /**
     * Short version of {@link #glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2s(int index, short v0, short v1);

    /**
     * Double version of {@link #glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2d(int index, double v0, double v1);

    /**
     * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3f(int index, float v0, float v1, float v2);

    /**
     * Short version of {@link #glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3s(int index, short v0, short v1, short v2);

    /**
     * Double version of {@link #glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3d(int index, double v0, double v1, double v2);

    /**
     * Specifies the value of a generic vertex attribute.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3);

    /**
     * Short version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3);

    /**
     * Double version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3);

    /**
     * Normalized unsigned byte version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w);

    /** Unsafe version of: {@link #glVertexAttrib1fv VertexAttrib1fv} */
    void nglVertexAttrib1fv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1fv(int index, FloatBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib1sv VertexAttrib1sv} */
    void nglVertexAttrib1sv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib1s VertexAttrib1s}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1sv(int index, ShortBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib1dv VertexAttrib1dv} */
    void nglVertexAttrib1dv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib1d VertexAttrib1d}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1dv(int index, DoubleBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib2fv VertexAttrib2fv} */
    void nglVertexAttrib2fv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2fv(int index, FloatBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib2sv VertexAttrib2sv} */
    void nglVertexAttrib2sv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib2s VertexAttrib2s}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2sv(int index, ShortBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib2dv VertexAttrib2dv} */
    void nglVertexAttrib2dv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib2d VertexAttrib2d}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2dv(int index, DoubleBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib3fv VertexAttrib3fv} */
    void nglVertexAttrib3fv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3fv(int index, FloatBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib3sv VertexAttrib3sv} */
    void nglVertexAttrib3sv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib3s VertexAttrib3s}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3sv(int index, ShortBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib3dv VertexAttrib3dv} */
    void nglVertexAttrib3dv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib3d VertexAttrib3d}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3dv(int index, DoubleBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4fv VertexAttrib4fv} */
    void nglVertexAttrib4fv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4fv(int index, FloatBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4sv VertexAttrib4sv} */
    void nglVertexAttrib4sv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib4s VertexAttrib4s}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4sv(int index, ShortBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4dv VertexAttrib4dv} */
    void nglVertexAttrib4dv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib4d VertexAttrib4d}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4dv(int index, DoubleBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4iv VertexAttrib4iv} */
    void nglVertexAttrib4iv(int index, long v);

    /**
     * Integer pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4iv(int index, IntBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4bv VertexAttrib4bv} */
    void nglVertexAttrib4bv(int index, long v);

    /**
     * Byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4bv(int index, ByteBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4ubv VertexAttrib4ubv} */
    void nglVertexAttrib4ubv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib4Nub VertexAttrib4Nub}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4ubv(int index, ByteBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4usv VertexAttrib4usv} */
    void nglVertexAttrib4usv(int index, long v);

    /**
     * Unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4usv(int index, ShortBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4uiv VertexAttrib4uiv} */
    void nglVertexAttrib4uiv(int index, long v);

    /**
     * Unsigned int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4uiv(int index, IntBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4Nbv VertexAttrib4Nbv} */
    void nglVertexAttrib4Nbv(int index, long v);

    /**
     * Normalized byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nbv(int index, ByteBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4Nsv VertexAttrib4Nsv} */
    void nglVertexAttrib4Nsv(int index, long v);

    /**
     * Normalized short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nsv(int index, ShortBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4Niv VertexAttrib4Niv} */
    void nglVertexAttrib4Niv(int index, long v);

    /**
     * Normalized int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Niv(int index, IntBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4Nubv VertexAttrib4Nubv} */
    void nglVertexAttrib4Nubv(int index, long v);

    /**
     * Normalized unsigned byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nubv(int index, ByteBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4Nusv VertexAttrib4Nusv} */
    void nglVertexAttrib4Nusv(int index, long v);

    /**
     * Normalized unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nusv(int index, ShortBuffer v);

    /** Unsafe version of: {@link #glVertexAttrib4Nuiv VertexAttrib4Nuiv} */
    void nglVertexAttrib4Nuiv(int index, long v);

    /**
     * Normalized unsigned int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nuiv(int index, IntBuffer v);

    /** Unsafe version of: {@link #glVertexAttribPointer VertexAttribPointer} */
    void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer);

    /**
     * Enables a generic vertex attribute array.
     *
     * @param index the index of the generic vertex attribute to be enabled
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glEnableVertexAttribArray">Reference Page</a>
     */
    void glEnableVertexAttribArray(int index);

    /**
     * Disables a generic vertex attribute array.
     *
     * @param index the index of the generic vertex attribute to be disabled
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glDisableVertexAttribArray">Reference Page</a>
     */
    void glDisableVertexAttribArray(int index);

    /** Unsafe version of: {@link #glBindAttribLocation BindAttribLocation} */
    void nglBindAttribLocation(int program, int index, long name);

    /**
     * Associates a generic vertex attribute index with a named attribute variable.
     *
     * @param program the program object in which the association is to be made
     * @param index   the index of the generic vertex attribute to be bound
     * @param name    a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindAttribLocation">Reference Page</a>
     */
    void glBindAttribLocation(int program, int index, ByteBuffer name);

    /**
     * Associates a generic vertex attribute index with a named attribute variable.
     *
     * @param program the program object in which the association is to be made
     * @param index   the index of the generic vertex attribute to be bound
     * @param name    a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindAttribLocation">Reference Page</a>
     */
    void glBindAttribLocation(int program, int index, CharSequence name);

    /**
     * Unsafe version of: {@link #glGetActiveAttrib GetActiveAttrib}
     *
     * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
     */
    void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name);

    /**
     * Returns information about an active attribute variable for the specified program object.
     *
     * @param program the program object to be queried
     * @param index   the index of the attribute variable to be queried
     * @param length  the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than
     *                {@code NULL} is passed
     * @param size    the size of the attribute variable
     * @param type    the data type of the attribute variable
     * @param name    a null terminated string containing the name of the attribute variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>
     */
    void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    /**
     * Returns information about an active attribute variable for the specified program object.
     *
     * @param program   the program object to be queried
     * @param index     the index of the attribute variable to be queried
     * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
     * @param size      the size of the attribute variable
     * @param type      the data type of the attribute variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>
     */

    String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer size, IntBuffer type);

    /**
     * Returns information about an active attribute variable for the specified program object.
     *
     * @param program the program object to be queried
     * @param index   the index of the attribute variable to be queried
     * @param size    the size of the attribute variable
     * @param type    the data type of the attribute variable
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>
     */

    String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type);

    /** Unsafe version of: {@link #glGetAttribLocation GetAttribLocation} */
    int nglGetAttribLocation(int program, long name);

    /**
     * Returns the location of an attribute variable.
     *
     * @param program the program object to be queried
     * @param name    a null terminated string containing the name of the attribute variable whose location is to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetAttribLocation">Reference Page</a>
     */
    int glGetAttribLocation(int program, ByteBuffer name);

    /**
     * Returns the location of an attribute variable.
     *
     * @param program the program object to be queried
     * @param name    a null terminated string containing the name of the attribute variable whose location is to be queried
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetAttribLocation">Reference Page</a>
     */
    int glGetAttribLocation(int program, CharSequence name);

    /** Unsafe version of: {@link #glGetVertexAttribiv GetVertexAttribiv} */
    void nglGetVertexAttribiv(int index, int pname, long params);

    void glGetVertexAttribiv(int index, int pname, IntBuffer params);

    int glGetVertexAttribi(int index, int pname);

    /** Unsafe version of: {@link #glGetVertexAttribfv GetVertexAttribfv} */
    void nglGetVertexAttribfv(int index, int pname, long params);

    /**
     * Float version of {@link #glGetVertexAttribiv GetVertexAttribiv}.
     *
     * @param index  the generic vertex attribute parameter to be queried
     * @param pname  the symbolic name of the vertex attribute parameter to be queried
     * @param params returns the requested data
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    void glGetVertexAttribfv(int index, int pname, FloatBuffer params);

    /** Unsafe version of: {@link #glGetVertexAttribdv GetVertexAttribdv} */
    void nglGetVertexAttribdv(int index, int pname, long params);

    /**
     * Double version of {@link #glGetVertexAttribiv GetVertexAttribiv}.
     *
     * @param index  the generic vertex attribute parameter to be queried
     * @param pname  the symbolic name of the vertex attribute parameter to be queried
     * @param params returns the requested data
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    void glGetVertexAttribdv(int index, int pname, DoubleBuffer params);

    void nglGetVertexAttribPointerv(int index, int pname, long pointer);

    /**
     * Returns the address of the specified generic vertex attribute pointer.
     *
     * @param index the generic vertex attribute parameter to be queried
     * @param pname the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER VERTEX_ATTRIB_ARRAY_POINTER}</td></tr></table>
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttribPointerv">Reference Page</a>
     */

    long glGetVertexAttribPointer(int index, int pname);

    /**
     * Unsafe version of: {@link #glDrawBuffers DrawBuffers}
     *
     * @param n the number of buffers in {@code bufs}
     */
    void nglDrawBuffers(int n, long bufs);

    void glDrawBuffers(IntBuffer bufs);

    /**
     * Specifies a list of color buffers to be drawn into.
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glDrawBuffers">Reference Page</a>
     */
    void glDrawBuffers(int buf);

    void glBlendEquationSeparate(int modeRGB, int modeAlpha);

    void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass);

    void glStencilFuncSeparate(int face, int func, int ref, int mask);

    void glStencilMaskSeparate(int face, int mask);

    /**
     * Array version of: {@link #glUniform1fv Uniform1fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform1fv(int location, float[] value);

    /**
     * Array version of: {@link #glUniform2fv Uniform2fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform2fv(int location, float[] value);

    /**
     * Array version of: {@link #glUniform3fv Uniform3fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform3fv(int location, float[] value);

    /**
     * Array version of: {@link #glUniform4fv Uniform4fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform4fv(int location, float[] value);

    /**
     * Array version of: {@link #glUniform1iv Uniform1iv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform1iv(int location, int[] value);

    /**
     * Array version of: {@link #glUniform2iv Uniform2iv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform2iv(int location, int[] value);

    /**
     * Array version of: {@link #glUniform3iv Uniform3iv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform3iv(int location, int[] value);

    /**
     * Array version of: {@link #glUniform4iv Uniform4iv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniform4iv(int location, int[] value);

    /**
     * Array version of: {@link #glUniformMatrix2fv UniformMatrix2fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniformMatrix2fv(int location, boolean transpose, float[] value);

    /**
     * Array version of: {@link #glUniformMatrix3fv UniformMatrix3fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniformMatrix3fv(int location, boolean transpose, float[] value);

    /**
     * Array version of: {@link #glUniformMatrix4fv UniformMatrix4fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    void glUniformMatrix4fv(int location, boolean transpose, float[] value);

    /**
     * Array version of: {@link #glGetShaderiv GetShaderiv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShader">Reference Page</a>
     */
    void glGetShaderiv(int shader, int pname, int[] params);

    /**
     * Array version of: {@link #glGetProgramiv GetProgramiv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgram">Reference Page</a>
     */
    void glGetProgramiv(int program, int pname, int[] params);

    /**
     * Array version of: {@link #glGetShaderInfoLog GetShaderInfoLog}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>
     */
    void glGetShaderInfoLog(int shader, int[] length, ByteBuffer infoLog);

    /**
     * Array version of: {@link #glGetProgramInfoLog GetProgramInfoLog}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>
     */
    void glGetProgramInfoLog(int program, int[] length, ByteBuffer infoLog);

    /**
     * Array version of: {@link #glGetAttachedShaders GetAttachedShaders}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetAttachedShaders">Reference Page</a>
     */
    void glGetAttachedShaders(int program, int[] count, int[] shaders);

    /**
     * Array version of: {@link #glGetActiveUniform GetActiveUniform}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveUniform">Reference Page</a>
     */
    void glGetActiveUniform(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    /**
     * Array version of: {@link #glGetUniformfv GetUniformfv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    void glGetUniformfv(int program, int location, float[] params);

    /**
     * Array version of: {@link #glGetUniformiv GetUniformiv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    void glGetUniformiv(int program, int location, int[] params);

    /**
     * Array version of: {@link #glGetShaderSource GetShaderSource}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderSource">Reference Page</a>
     */
    void glGetShaderSource(int shader, int[] length, ByteBuffer source);

    /**
     * Array version of: {@link #glVertexAttrib1fv VertexAttrib1fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1fv(int index, float[] v);

    /**
     * Array version of: {@link #glVertexAttrib1sv VertexAttrib1sv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1sv(int index, short[] v);

    /**
     * Array version of: {@link #glVertexAttrib1dv VertexAttrib1dv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib1dv(int index, double[] v);

    /**
     * Array version of: {@link #glVertexAttrib2fv VertexAttrib2fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2fv(int index, float[] v);

    /**
     * Array version of: {@link #glVertexAttrib2sv VertexAttrib2sv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2sv(int index, short[] v);

    /**
     * Array version of: {@link #glVertexAttrib2dv VertexAttrib2dv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib2dv(int index, double[] v);

    /**
     * Array version of: {@link #glVertexAttrib3fv VertexAttrib3fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3fv(int index, float[] v);

    /**
     * Array version of: {@link #glVertexAttrib3sv VertexAttrib3sv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3sv(int index, short[] v);

    /**
     * Array version of: {@link #glVertexAttrib3dv VertexAttrib3dv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib3dv(int index, double[] v);

    /**
     * Array version of: {@link #glVertexAttrib4fv VertexAttrib4fv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4fv(int index, float[] v);

    /**
     * Array version of: {@link #glVertexAttrib4sv VertexAttrib4sv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4sv(int index, short[] v);

    /**
     * Array version of: {@link #glVertexAttrib4dv VertexAttrib4dv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4dv(int index, double[] v);

    /**
     * Array version of: {@link #glVertexAttrib4iv VertexAttrib4iv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4iv(int index, int[] v);

    /**
     * Array version of: {@link #glVertexAttrib4usv VertexAttrib4usv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4usv(int index, short[] v);

    /**
     * Array version of: {@link #glVertexAttrib4uiv VertexAttrib4uiv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4uiv(int index, int[] v);

    /**
     * Array version of: {@link #glVertexAttrib4Nsv VertexAttrib4Nsv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nsv(int index, short[] v);

    /**
     * Array version of: {@link #glVertexAttrib4Niv VertexAttrib4Niv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Niv(int index, int[] v);

    /**
     * Array version of: {@link #glVertexAttrib4Nusv VertexAttrib4Nusv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nusv(int index, short[] v);

    /**
     * Array version of: {@link #glVertexAttrib4Nuiv VertexAttrib4Nuiv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    void glVertexAttrib4Nuiv(int index, int[] v);

    /**
     * Array version of: {@link #glGetActiveAttrib GetActiveAttrib}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>
     */
    void glGetActiveAttrib(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    /**
     * Array version of: {@link #glGetVertexAttribiv GetVertexAttribiv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    void glGetVertexAttribiv(int index, int pname, int[] params);

    /**
     * Array version of: {@link #glGetVertexAttribfv GetVertexAttribfv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    void glGetVertexAttribfv(int index, int pname, float[] params);

    /**
     * Array version of: {@link #glGetVertexAttribdv GetVertexAttribdv}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    void glGetVertexAttribdv(int index, int pname, double[] params);

    /**
     * Array version of: {@link #glDrawBuffers DrawBuffers}
     *
     * @see <a target="_blank" href="http://docs.gl/gl4/glDrawBuffers">Reference Page</a>
     */
    void glDrawBuffers(int[] bufs);

    void glActiveTexture(int texture);
}
