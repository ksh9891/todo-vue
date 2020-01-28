<template>
    <v-form v-model="valid">
        <v-container>
            <v-row>
                <v-col cols="12">
                    <v-text-field
                            v-model="email"
                            :rules="emailRules"
                            label="이메일"
                            required
                    ></v-text-field>
                </v-col>
            </v-row>
            <v-row>
                <v-col cols="12">
                    <v-text-field
                            v-model="password"
                            :rules="passwordRules"
                            label="비밀번호"
                            type="password"
                            required
                    />
                </v-col>
            </v-row>
            <v-row>
                <v-col cols="12">
                    <v-text-field
                            v-model="passwordConfirm"
                            :rules="passwordConfirmRules"
                            label="비밀번호 확인"
                            type="password"
                            required
                    />
                </v-col>
            </v-row>
        </v-container>
    </v-form>
</template>

<script>
    export default {
        name: "Login.vue",
        data: () => ({
            valid: false,
            email: '',
            emailRules: [
                v => !!v || 'E-mail is required',
                v => /.+@.+/.test(v) || 'E-mail must be valid',
            ],
        }),
    }
</script>

<style scoped>

</style>