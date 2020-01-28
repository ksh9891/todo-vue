<template>
    <v-card
            class="mx-auto px-5 py-5"
            width="500px"
    >
        <v-form v-model="valid">
            <v-row class="width">
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
                    <v-btn
                            block
                            dark
                            color="indigo"
                            @click="submit"
                    >로그인</v-btn>
                </v-col>
            </v-row>
        </v-form>
    </v-card>
</template>

<script>
    import validator from 'validator';

    export default {
        name: "Login.vue",
        data: () => ({
            valid: true,
            email: '',
            emailRules: [
                v => !validator.isEmpty(v) || '이메일을 입력해주세요.',
                v => validator.isEmail(v) || '이메일 형식이 올바르지 않습니다.',
            ],
            password: '',
            passwordRules: [
                v => !validator.isEmpty(v) || '비밀번호를 입력해주세요.',
                // 숫자, 문자, 특수문자 중 2가지 포함 (8~15자)
                v => validator.matches(v, '^(?=.*[a-zA-Z0-9])(?=.*[a-zA-Z!@#$%^&*])(?=.*[0-9!@#$%^&*]).{8,15}$') || '비밀번호 형식이 올바르지 않습니다.',
            ]
        }),
        methods: {
            submit() {
                return (this.valid) ? this.$router.push("/") : alert("실패!");
            }
        }
    }
</script>

<style scoped>

</style>